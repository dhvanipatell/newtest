package web.tests.employeeActionTests;

import io.unity.framework.init.base;
import io.unity.framework.readers.DataReader;
import io.unity.framework.readers.json_file_reader;
import io.unity.framework.remotegrid.LambdaTestConfig;
import org.bouncycastle.util.test.TestRandomData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.Logger;
import web.object_repository.employeeProfilePage.employeeProfile;
import web.object_repository.login.login_page;
import web.object_repository.newEmployeesPage.new_employees;
import web.object_repository.employeeActionPage.employee_action;

public class EmployeeActionTest extends base {

    login_page login = null;
    web.object_repository.employeeProfilePage.employeeProfile employeeProfile = null;
    web.object_repository.newEmployeesPage.new_employees new_employees = null;

    employee_action employee_action = null;

    @DataProvider(name = "login_credentials")
    public Object[][] data_provider() {
        json_file_reader config = new json_file_reader();
        DataReader reader = new DataReader();
        Object[][] data = null;
        if (config.getEnvFromCurrentConfig().contains("test") || config.getEnvFromCurrentConfig().contains("ngdev")) {
            data = reader.getExcelDataForDataProvider("nevvon_test_env.xlsx", 0);
        } else if (config.getEnvFromCurrentConfig().contains("admin")) {
            data = reader.getExcelDataForDataProvider("nevvon_prod_env.xlsx", 0);
        }
        return data;
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_Export_button(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-451");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on Export button");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.click_on_export_button_employee_action();
    }


    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_Search_text_box(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-452");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on Search text_box");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_search_button_employee_action_is_present_on_page();
        employee_action.click_on_search_button_employee_action();
        employee_action.enter_text_at_search_button_employee_action("Test");
    }


    @Test(dataProvider = "login_credentials")
    public void verify_when_click_on_message_send_message_popup_appears(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-112");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when click on message send message popup appears");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_message_option_employee_action_is_present_on_page();
        employee_action.click_on_message_option_employee_action();
        employee_action.verify_message_header_employee_action_is_present_on_page();
    }


    @Test(dataProvider = "login_credentials")
    public void verify_when_cancel_icon_the_popup_from_upper_right_corner(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-116");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when cancel icon the popup from upper right corner");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_message_option_employee_action_is_present_on_page();
        employee_action.click_on_message_option_employee_action();
        employee_action.verify_message_header_employee_action_is_present_on_page();
        employee_action.verify_cross_button_employee_action_is_present_on_page();
        employee_action.click_on_cross_button_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_names_of_selected_employees_appears_on_send_message_popup(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-114");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify names of selected employees appears on send message popup");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_message_option_employee_action_is_present_on_page();
        employee_action.click_on_message_option_employee_action();
        employee_action.verify_message_header_employee_action_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_cancel_button_popup_disappears(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-120");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on cancel button popup disappears");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_message_option_employee_action_is_present_on_page();
        employee_action.click_on_message_option_employee_action();
        employee_action.verify_message_header_employee_action_is_present_on_page();
        employee_action.verify_cancel_button_employee_action_is_present_on_page();
        employee_action.click_on_cancel_button_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_admin_sends_blank_message_validation_message_appears(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-122");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when admin sends blank message validation message appears");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_message_option_employee_action_is_present_on_page();
        employee_action.click_on_message_option_employee_action();
        employee_action.verify_message_header_employee_action_is_present_on_page();
        employee_action.verify_send_button_employee_action_is_present_on_page();
        employee_action.click_on_send_button_employee_action();
        employee_action.verify_message_required_alert_employee_action_is_present_on_page();
    }


    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_first_name_the_first_name_of_employees_appears_in_the_message(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-117");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on first name the first name of employees appears in the message");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_message_option_employee_action_is_present_on_page();
        employee_action.click_on_message_option_employee_action();
        employee_action.verify_message_header_employee_action_is_present_on_page();
        employee_action.verify_firstName_label_employee_action_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_last_name_the_last_name_of_employees_appears_in_the_message(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-118");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on last name, the last name of the employees appears in the message");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_message_option_employee_action_is_present_on_page();
        employee_action.click_on_message_option_employee_action();
        employee_action.verify_message_header_employee_action_is_present_on_page();
        employee_action.verify_lastname_label_employee_action_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_admin_sends_only_entering_spaces_validation_message_appears(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-121");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when admin sends only entering spaces validation message appears");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_message_option_employee_action_is_present_on_page();
        employee_action.click_on_message_option_employee_action();
        employee_action.verify_message_header_employee_action_is_present_on_page();
        employee_action.verify_textArea_message_option_employee_action_is_present_on_page();
        employee_action.enter_text_at_textArea_message_option_employee_action("  ");
        employee_action.verify_send_button_employee_action_is_present_on_page();
        employee_action.click_on_send_button_employee_action();
        employee_action.verify_message_required_alert_employee_action_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_customize_column_popup_appears(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-143");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on customize column popup appears");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_customize_columns_option_employee_action_is_present_on_page();
        employee_action.click_on_customize_columns_option_employee_action();
        employee_action.verify_customize_columns_header_option_employee_action_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_checkbox_checkboxes_and_save_button_changes_saved_successfully_toast_message_shows(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-144");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on checkbox checkboxes and save button changes saved successfully toast message shows");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_customize_columns_option_employee_action_is_present_on_page();
        employee_action.click_on_customize_columns_option_employee_action();
        employee_action.verify_customize_columns_header_option_employee_action_is_present_on_page();
        employee_action.click_on_popup_employee_option_check_box();
        employee_action.verify_customize_save_button_employee_action_is_present_on_page();
        employee_action.click_on_customize_save_button_employee_action();
        employee_action.verify_changes_saved_alert_employee_action_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_columns_gets_modified_as_per_the_changes_made(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-145");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify columns gets modified as per the changes made");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_customize_columns_option_employee_action_is_present_on_page();
        employee_action.click_on_customize_columns_option_employee_action();
        employee_action.verify_customize_columns_header_option_employee_action_is_present_on_page();
        employee_action.click_on_popup_employee_option_check_box();
        employee_action.verify_customize_save_button_employee_action_is_present_on_page();

    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_reset_link(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-449");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on reset link");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_customize_columns_option_employee_action_is_present_on_page();
        employee_action.click_on_customize_columns_option_employee_action();
        employee_action.verify_customize_columns_header_option_employee_action_is_present_on_page();
        employee_action.verify_customize_reset_button_employee_action_is_present_on_page();
        employee_action.click_on_customize_reset_button_employee_action();

    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_cancel_button(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-450");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on cancel button");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        employee_action.verify_export_button_employee_action_is_present_on_page();
        employee_action.verify_first_employee_checkout_employee_action_is_present_on_page();
        employee_action.click_on_first_employee_checkout_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_customize_columns_option_employee_action_is_present_on_page();
        employee_action.click_on_customize_columns_option_employee_action();
        employee_action.verify_customize_columns_header_option_employee_action_is_present_on_page();
        employee_action.verify_customize_cancel_button_employee_action_is_present_on_page();
        employee_action.click_on_customize_cancel_button_employee_action();
        employee_action.verify_action_button_employee_action_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_number_of_selected_employees_appears_on_send_message_pop_up(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-113");
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify number of selected employees appears on send message pop up");
        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);
        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        new_employees.click_on_employee_check_box();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_employee_popup_option_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_hover_cursor_to_set_status_to_three_options_appear(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-124");
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when hover cursor to set status to, three options appear");
        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);
        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        new_employees.click_on_employee_check_box();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_employee_popup_option_present_on_page();
        employee_action.click_on_action_dropdown_set_status_to_option();
        employee_action.verify_set_status_option_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_active_the_activate_employees_popup_appears_click_close_icon(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-125");
        Logger.log_qase_id("NEV-560");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on active, the activate employees popup appears click close icon");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        new_employees.click_on_employee_check_box();

        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_employee_popup_option_present_on_page();
        employee_action.click_on_action_dropdown_set_status_to_option();
        employee_action.verify_set_status_option_is_present_on_page();
        employee_action.click_on_active_option_of_employee_action_dropdown();
        employee_action.verify_set_to_active_popup_display();
        employee_action.click_on_active_popup_close_icon();
        employeeProfile.verify_employee_name_is_present_on_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_the_activate_employees_popup_has_total_number_of_selected_employees(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-126");
        Logger.log_qase_id("NEV-127");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify the activate employees popup has total number of selected employees");
        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        new_employees.click_on_employee_check_box();
        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_employee_popup_option_present_on_page();
        employee_action.click_on_action_dropdown_set_status_to_option();
        employee_action.verify_set_status_option_is_present_on_page();
        employee_action.click_on_active_option_of_employee_action_dropdown();
        employee_action.verify_set_to_active_popup_display();
        employee_action.verify_total_no_of_selected_employee();
        //employee_action.verify_show_selected_employee_name();
        employee_action.click_on_cancel_button_active_employee_action_popup();
        employee_action.verify_employee_header_present_on_employee_page();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_On_hold_copy_icon_close_button(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-131");
        Logger.log_qase_id("NEV-561");
        Logger.log_qase_id("NEV-562");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on On hold copy icon close button");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        new_employees.click_on_employee_check_box();

        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_employee_popup_option_present_on_page();
        employee_action.click_on_action_dropdown_set_status_to_option();
        employee_action.verify_set_status_option_is_present_on_page();
        employee_action.click_on_On_hold_option_of_employee_action_dropdown();
        employee_action.verify_set_to_status_on_hold_popup_display();
        employee_action.click_on_on_hold_popup_copy_icon();
        employee_action.click_on_on_hold_popup_close_icon();
        employee_action.click_on_search_button_employee_action();
        employee_action.on_hold_popup_paste_copy_msg();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_on_hold_popup_has_place_on_hold_and_cancel_button(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-135");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify on hold popup has place on hold and cancel button");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        new_employees.click_on_employee_check_box();

        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_employee_popup_option_present_on_page();
        employee_action.click_on_action_dropdown_set_status_to_option();
        employee_action.verify_set_status_option_is_present_on_page();
        employee_action.click_on_On_hold_option_of_employee_action_dropdown();
        employee_action.verify_set_to_status_on_hold_popup_display();
        employee_action.click_on_on_hold_popup_cancel_button();
        employee_action.verify_employee_header_present_on_employee_page();
    }
    @Test(dataProvider = "login_credentials")
    public void  verify_when_clicks_place_on_hold_the_employees_placed_on_hold_validation_appears(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-136");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName(" verify when clicks place on hold, the employees placed on hold validation appears");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        new_employees.click_on_employee_check_box();

        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_employee_popup_option_present_on_page();
        employee_action.click_on_action_dropdown_set_status_to_option();
        employee_action.verify_set_status_option_is_present_on_page();
        employee_action.click_on_On_hold_option_of_employee_action_dropdown();
        employee_action.verify_set_to_status_on_hold_popup_display();
        employee_action.click_on_on_hold_popup_place_on_hold_button();
        employee_action.verify_employee_on_hold_successful_validation_msg_display();

    }
    @Test(dataProvider = "login_credentials")
    public void  verify_when_clicks_on_terminate_the_terminate_popup_appears_and_validation_msg_display(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-137");
        Logger.log_qase_id("NEV-142");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on terminate, the terminate popup appears and validation msg display");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        new_employees.click_on_employee_check_box();

        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_employee_popup_option_present_on_page();
        employee_action.click_on_action_dropdown_set_status_to_option();
        employee_action.verify_set_status_option_is_present_on_page();
        employee_action.click_on_terminate_option_of_employee_action_dropdown();
        employee_action.verify_set_to_status_on_terminate_popup_display();
        employee_action.click_on_terminate_button_on_terminate_popup();
        employee_action.verify_employee_terminate_successful_validation_msg_display();

    }
    @Test(dataProvider = "login_credentials")
    public void verify_when_clicks_on_cancel_button_the_terminate_popup_disappears(String userName, String password, String agency_name) {
        Logger.log_qase_id("NEV-141");

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("verify when clicks on cancel button, the terminate popup disappears");

        login = new login_page(driver);
        new_employees = new new_employees(driver);
        employeeProfile = new employeeProfile(driver);
        employee_action = new employee_action(driver);
        login.performLogin(userName, password);

        new_employees.verify_employees_Option_is_present_on_page();
        new_employees.click_on_employees_Option();
        new_employees.click_on_employee_check_box();

        employee_action.click_on_action_dropdown_button_employee_action();
        employee_action.verify_employee_popup_option_present_on_page();
        employee_action.click_on_action_dropdown_set_status_to_option();
        employee_action.verify_set_status_option_is_present_on_page();
        employee_action.click_on_terminate_option_of_employee_action_dropdown();
        employee_action.verify_set_to_status_on_terminate_popup_display();
        employee_action.click_on_terminate_popup_cancel_button();
        employee_action.verify_employee_header_present_on_employee_page();
    }
}
