package web.tests.login;

import io.unity.framework.init.base;
import io.unity.framework.readers.DataReader;
import io.unity.framework.readers.json_file_reader;
import io.unity.framework.remotegrid.LambdaTestConfig;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.Logger;
import web.object_repository.csdashboard.dashboard_page;
import web.object_repository.forgotPassword.forgot_password;
import web.object_repository.login.login_page;


public class LoginTests extends base {

    login_page login = null;
    forgot_password forgotPassword = null;
    @DataProvider(name = "login_credentials")
    public Object[][] data_provider() {
        json_file_reader config = new json_file_reader();
        DataReader reader = new DataReader();
        Object[][] data = null;
        if (config.getEnvFromCurrentConfig().contains("test") || config.getEnvFromCurrentConfig().contains("ngdev") ) {
            data = reader.getExcelDataForDataProvider("nevvon_test_env.xlsx", 0);
        } else if (config.getEnvFromCurrentConfig().contains("admin")) {
            data = reader.getExcelDataForDataProvider("nevvon_prod_env.xlsx", 0);
        }
        return data;
    }


    @Test(dataProvider = "login_credentials")
    public void verify_login_with_valid_user(String userName, String password, String agency_name) {

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName(" Verify login with valid credentials");

        Logger.log_qase_id("NP-1");

        login_page login = new login_page(driver);
        dashboard_page dashboard = new dashboard_page(driver);

        login.verify_email_text_box_is_present_on_page();
        login.verify_password_button_is_present_on_page();
        login.verify_login_button_is_present_on_page();

        login.performLogin(userName, password);

        dashboard.verify_logo_is_present_on_page();
    }


    @Test
    public void verify_login_with_blank_user() {

        Logger.log_qase_id("NP-2");
        Logger.log_qase_id("NP-3");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify login with blank user");

        login_page login = new login_page(driver);

        login.verify_login_button_is_present_on_page();
        login.click_on_login_button();
        login.verify_blank_email_message_is_present_on_page();
        login.verify_blank_password_message_is_present_on_page();
    }

    @Test
    public void verify_login_with_blank_password() {
        Logger.log_qase_id("NP-4");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify login with blank user");

        login_page login = new login_page(driver);

        login.verify_email_text_box_is_present_on_page();
        login.enter_text_at_email_text_box("viral@nevvon.com");
        login.click_on_login_button();
        login.verify_blank_password_message_is_present_on_page();

    }

    @Test
    public void verify_login_with_user_and_password_both_empty() {
        Logger.log_qase_id("NP-5");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify login with user and password both empty");


        login_page login = new login_page(driver);

        login.enter_text_at_email_text_box("");
        login.enter_text_at_password("");

        login.click_on_login_button();

        login.verify_blank_email_message_is_present_on_page();
        login.verify_blank_password_message_is_present_on_page();

    }

    @Test
    public void verify_login_with_valid_user_and_invalid_password() {
        Logger.log_qase_id("NP-6");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify login with valid user and invalid password");

        login_page login = new login_page(driver);

        login.enter_text_at_email_text_box("viral@nevvon.com");
        login.enter_text_at_password("13245666");

        login.click_on_login_button();

        login.verify_wrong_credential_warning_message();

    }

    @Test
    public void verify_login_invalid_user_and_valid_password() {
        Logger.log_qase_id("NP-7");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify login invalid user and valid password");

        login_page login = new login_page(driver);

        login.enter_text_at_email_text_box("test@nevvon.com");
        login.enter_text_at_password("132456a");

        login.click_on_login_button();
        login.verify_wrong_credential_warning_message();

    }

    @Test
    public void verify_login_with_wrong_email_format_and_password() {
        Logger.log_qase_id("NP-8");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify login with wrong email format and password");

        login_page login = new login_page(driver);

        login.enter_text_at_email_text_box("viral#test#nevvon.com");
        login.enter_text_at_password("132456a");

        login.click_on_login_button();
        login.verify_wrong_credential_warning_message();
    }

    @Test
    public void verify_login_with_entering_spaces_in_email_and_password() {
        Logger.log_qase_id("NP-9");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify login with entering spaces in email and password");

        login_page login = new login_page(driver);

        login.enter_text_at_email_text_box("vir al@nevvon.com");
        login.enter_text_at_password("132456a ");

        login.click_on_login_button();
        login.verify_wrong_credential_warning_message();



    }

    @Test
    public void verify_login_with_invalid_single_quote_in_email_and_password() {
        Logger.log_qase_id("NP-10");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify login with invalid single quote in email and password");

        login_page login = new login_page(driver);

        login.enter_text_at_email_text_box("viral's@nevvon.com");
        login.enter_text_at_password("132456a ");

        login.click_on_login_button();
        login.verify_wrong_credential_warning_message();

    }

    @Test
    public void verify_login_with_invalid_user_with_html_tag_and_password() {
        Logger.log_qase_id("NP-11");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify login with_invalid_user_with_html_tag_and_password");

        login_page login = new login_page(driver);

        login.enter_text_at_email_text_box("viral<123>test@nevvon.com");
        login.enter_text_at_password("132456a ");
        login.click_on_login_button();
        login.verify_wrong_credential_warning_message();

    }

    @Test
    public void verify_when_click_on_Back_to_login_link_it_gets_back_to_login_page()
    {
        Logger.log_qase_id("NEV-104");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when click on Back to login link, it gets back to login page");

        login = new login_page(driver);

        forgotPassword = new forgot_password(driver);

        login.verify_forgot_your_password_link_is_present_on_page();
        login.click_on_forgot_your_password_link();
        login.verify_redirect_to_forgot_password_page();
        login.click_on_back_to_login_link();
        login.verify_redirect_to_login_page();

    }
    @Test
    public void  verify_CS_not_getting_reset_password_for_unregistered_user()
    {
        Logger.log_qase_id("NEV-108");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName(" verify CS not getting reset password for unregistered user");

        login = new login_page(driver);

        forgotPassword = new forgot_password(driver);

        login.verify_forgot_your_password_link_is_present_on_page();
        login.click_on_forgot_your_password_link();
        login.verify_redirect_to_forgot_password_page();
        login.enter_text_email_at_forgot_password_text_box("dhwani@qable.io");
        login.click_on_send_button();
        login.verify_invalid_validation_message_display();

    }
    @Test
    public void  verify_user_gets_mail_when_send_reset_password_mail()
    {
        Logger.log_qase_id("NEV-105");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName(" verify user gets mail when send reset password mail");

        login = new login_page(driver);

        forgotPassword = new forgot_password(driver);

        login.verify_forgot_your_password_link_is_present_on_page();
        login.click_on_forgot_your_password_link();
        login.verify_redirect_to_forgot_password_page();
        login.enter_text_email_at_forgot_password_text_box("viral@nevvon.com");
        login.click_on_send_button();
        login.verify_set_successfully_validation_msg();

    }
    @Test
    public void   verify_when_click_on_send_button_without_entering_email()
    {
        Logger.log_qase_id("NEV-109");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when click on send button without entering email");

        login = new login_page(driver);

        forgotPassword = new forgot_password(driver);

        login.verify_forgot_your_password_link_is_present_on_page();
        login.click_on_forgot_your_password_link();
        login.verify_redirect_to_forgot_password_page();
        login.click_on_send_button();
        login.verify_email_required_validation_msg_show();

    }
}
