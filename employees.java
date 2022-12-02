package web.object_repository.newEmployeesPage;
import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.name;

public class new_employees {
	WebDriver driver = null;
	Element element = null;
	Verify verify = null;
	Wait wait = null;
	public new_employees(WebDriver driver) {
		this.driver = driver;
		element = new Element(driver);
		verify = new Verify(driver);
		wait = new Wait(driver);
	}
	@MethodsData(method_id = "button_1")
	public void verify_employees_Option_is_present_on_page() {
		wait.wait_for_second(10);
		verify.element_is_present("employees_Option");
	}
	@MethodsData(method_id = "button_1")
	public void click_on_employees_Option() {
		element.click("employees_Option");
	}
	@MethodsData(method_id = "button_1")
	public void verify_new_employees_button_is_present_on_page() {
		wait.wait_for_second(2);
		verify.element_is_present("new_employees_button");
	}
	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_phone_number_text_box(String text_to_enter) {
		wait.wait_for_second(3);
		element.enter_text("phone_number_text_box", text_to_enter);
		wait.wait_for_second(2);
	}
	@MethodsData(method_id = "button_1")
	public void verify_first_name_text_box_is_present_on_page() {
		wait.wait_for_second(5);
		verify.element_is_present("first_name_text_box_on_popup");
	}
	@MethodsData(method_id = "button_1")
	public void verify_create_employee_progress_step() {
		verify.element_is_present("employee_progress");
	}
	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_first_name_text_box(String text_to_enter) {
		element.click("first_name_text_box_on_popup");
		element.enter_text("first_name_text_box_on_popup", text_to_enter);
	}
	@MethodsData(method_id = "button_1")
	public void verify_last_name_text_box_is_present_on_page() {
		verify.element_is_present("last_name_text_box_on_popup");
	}
	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_last_name_text_box(String text_to_enter) {
		element.click("last_name_text_box_on_popup");
		element.enter_text("last_name_text_box_on_popup", text_to_enter);
		wait.wait_for_second(2);
	}
	@MethodsData(method_id = "button_1")
	public void verify_employee_hiring_date_text_box_is_present_on_page() {
		wait.wait_for_second(5);
		verify.element_is_present("employee_hiring_date_text_box");
		element.click("employee_hiring_date_text_box");
	}
	@MethodsData(method_id = "button_1")
	public void select_date_from_calendar_popup() {
		element.enter_text("employee_hiring_date","Nov 29,2022");
	}
	@MethodsData(method_id = "button_1")
	public void verify_employee_redirect_to_employee_profile() {
		verify.element_is_present("employee_display_employee_profile");
	}
	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_employee_hiring_date_text_box(String text_to_enter) {
		wait.wait_for_second(5);
		element.click("employee_hiring_date_text_box");
		element.enter_text("employee_hiring_date_text_box", text_to_enter);
		wait.wait_for_second(2);
	}
	@MethodsData(method_id = "button_1")
	public void verify_phone_number_require_error_msg_is_present_on_page() {
		wait.wait_for_second(2);
		verify.element_is_present("phone_number_require_error_msg");
	}
	@MethodsData(method_id = "button_1")
	public void verify_first_name_require_error_msg_is_present_on_page() {
		wait.wait_for_second(2);
		verify.element_is_present("first_name_require_error_msg");
	}
	@MethodsData(method_id = "button_1")
	public void verify_last_name_require_error_msg_is_present_on_page() {
		wait.wait_for_second(2);
		verify.element_is_present("last_name_require_error_msg");
	}
	@MethodsData(method_id = "button_1")
	public void verify_country_drop_Drop_is_present_on_page() {
		wait.wait_for_second(2);
		verify.element_is_present("country_drop_Drop");
	}
	@MethodsData(method_id = "button_1")
	public void verify_find_Country_text_box_is_present_on_page() {
		wait.wait_for_second(2);
		verify.element_is_present("find_Country_text_box");
	}
	@MethodsData(method_id = "button_1")
	public void enter_text_for_search_country_from_country_dropdown_text_box(String text_to_enter) {
		element.click("find_Country_text_box");
		wait.wait_for_second(3);
		element.enter_text("find_Country_text_box" ,text_to_enter);
	}
	@MethodsData(method_id = "button_1")
	public void select_search_country() {
		element.find("india_Country_select");
		element.click("india_Country_select");
		wait.wait_for_second(2);
	}
	@MethodsData(method_id = "button_1")
	public void verify_phone_number_error_msg_is_present_on_page() {
		wait.wait_for_second(5);
		verify.element_is_present("phone_number_error_msg");
	}
	@MethodsData(method_id = "button_1")
	public void verify_new_employee_header_is_present_on_page() {
		wait.wait_for_second(2);
		verify.element_is_present("new_employee_header");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_cancel_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("cancel_button", button_text);
	}
	@MethodsData(method_id = "button_2")
	public void verify_cancel_button_is_clickable() {
		verify.element_is_enable("cancel_button");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_new_employee_header_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("new_employee_header", button_text);
	}
	@MethodsData(method_id = "button_3")
	public void click_on_new_employee_header() {
		element.click("new_employee_header");
	}
	@MethodsData(method_id = "button_2")
	public void verify_new_employee_header_is_clickable() {
		verify.element_is_enable("new_employee_header");
	}
	@MethodsData(method_id = "text_1")
	public void verify_employee_hiring_date_text_box_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("employee_hiring_date_text_box", button_text);
	}
	@MethodsData(method_id = "text_1")
	public void verify_find_Country_text_box_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("find_Country_text_box", button_text);
	}
	@MethodsData(method_id = "button_4")
	public void Verify_cancel_icon_on_popup_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("cancel_icon_on_popup", button_text);
	}
	@MethodsData(method_id = "button_3")
	public void click_on_cancel_icon_on_popup() {
		element.click("cancel_icon_on_popup");
	}
	@MethodsData(method_id = "button_2")
	public void verify_cancel_icon_on_popup_is_clickable() {
		verify.element_is_enable("cancel_icon_on_popup");
	}
	@MethodsData(method_id = "button_1")
	public void verify_cancel_icon_on_popup_is_present_on_page() {
		verify.element_is_present("cancel_icon_on_popup");
	}
	@MethodsData(method_id = "text_1")
	public void verify_phone_number_error_msg_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("phone_number_error_msg", button_text);
	}
	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_phone_number_text_box(String text_to_enter) {
		element.clear_and_enter_in_text_field("phone_number_text_box", text_to_enter);
	}
	@MethodsData(method_id = "text_box_4")
	public void verify_phone_number_text_box_is_present_on_page() {
		wait.wait_for_second(5);
		verify.element_is_present("phone_number_text_box");
	}
	@MethodsData(method_id = "text_box_2")
	public void clear_text_from_phone_number_text_box() {
		element.clear_text_field("phone_number_text_box");
	}
	@MethodsData(method_id = "link_2")
	public void Verify_employees_Option_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("employees_Option", button_text);
	}
	@MethodsData(method_id = "link_3")
	public void verify_employees_Option_is_clickable() {
		verify.element_is_enable("employees_Option");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_closed_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("closed_button", button_text);
	}
	@MethodsData(method_id = "button_2")
	public void verify_closed_button_is_clickable() {
		verify.element_is_enable("closed_button");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_back_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("back_button", button_text);
	}
	@MethodsData(method_id = "button_2")
	public void verify_back_button_is_clickable() {
		verify.element_is_enable("back_button");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_continue_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("continue_button", button_text);
	}
	@MethodsData(method_id = "button_3")
	public void click_on_continue_button() {
		element.click("continue_button");
	}
	@MethodsData(method_id = "button_2")
	public void verify_continue_button_is_clickable() {
		verify.element_is_enable("continue_button");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_country_drop_Drop_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("country_drop_Drop", button_text);
	}
	@MethodsData(method_id = "button_3")
	public void click_on_country_drop_Drop() {
		element.click("country_drop_Drop");
	}
	@MethodsData(method_id = "button_2")
	public void verify_country_drop_Drop_is_clickable() {
		verify.element_is_enable("country_drop_Drop");
	}
	@MethodsData(method_id = "text_1")
	public void verify_first_name_text_box_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("first_name_text_box", button_text);
	}
	@MethodsData(method_id = "button_4")
	public void Verify_phone_number_require_error_msg_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("phone_number_require_error_msg", button_text);
	}
	@MethodsData(method_id = "button_3")
	public void click_on_phone_number_require_error_msg() {
		element.click("phone_number_require_error_msg");
	}
	@MethodsData(method_id = "button_2")
	public void verify_phone_number_require_error_msg_is_clickable() {
		verify.element_is_enable("phone_number_require_error_msg");
	}
	@MethodsData(method_id = "text_1")
	public void verify_last_name_text_box_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("last_name_text_box", button_text);
	}
	@MethodsData(method_id = "button_4")
	public void Verify_create_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("create_button", button_text);
	}
	@MethodsData(method_id = "button_2")
	public void verify_create_button_is_clickable() {
		verify.element_is_enable("create_button");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_last_name_require_error_msg_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("last_name_require_error_msg", button_text);
	}
	@MethodsData(method_id = "button_3")
	public void click_on_last_name_require_error_msg() {
		element.click("last_name_require_error_msg");
	}
	@MethodsData(method_id = "button_2")
	public void verify_last_name_require_error_msg_is_clickable() {
		verify.element_is_enable("last_name_require_error_msg");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_new_employees_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("new_employees_button", button_text);
	}
	@MethodsData(method_id = "button_3")
	public void click_on_new_employees_button() {
		element.click("new_employees_button");
	}
	@MethodsData(method_id = "button_2")
	public void verify_new_employees_button_is_clickable() {
		verify.element_is_enable("new_employees_button");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_first_name_require_error_msg_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("first_name_require_error_msg", button_text);
	}
	@MethodsData(method_id = "button_3")
	public void click_on_first_name_require_error_msg() {
		element.click("first_name_require_error_msg");
	}
	@MethodsData(method_id = "button_2")
	public void verify_first_name_require_error_msg_is_clickable() {
		verify.element_is_enable("first_name_require_error_msg");
	}
	@MethodsData(method_id = "button_3")
	public void click_on_cancel_button() {
		element.click("cancel_button");
	}
	@MethodsData(method_id = "button_1")
	public void verify_cancel_button_is_present_on_page() {
		verify.element_is_present("cancel_button");
	}


	@MethodsData(method_id = "button_3")
	public void click_on_closed_button() {
		element.click("closed_button");
	}
	@MethodsData(method_id = "button_1")
	public void verify_closed_button_is_present_on_page() {
		verify.element_is_present("closed_button");
	}
	@MethodsData(method_id = "button_3")
	public void click_on_back_button() {
		wait.wait_for_second(2);
		element.click("back_button");
	}
	@MethodsData(method_id = "button_1")
	public void verify_back_button_is_present_on_page() {
		verify.element_is_present("back_button");
	}
	@MethodsData(method_id = "button_1")
	public void verify_continue_button_is_present_on_page() {
		verify.element_is_present("continue_button");
	}
	@MethodsData(method_id = "button_3")
	public void click_on_create_button() {
		wait.wait_for_second(2);
		element.click("new_emp_create_button");
	}

	@MethodsData(method_id = "button_1")
	public void verify_create_button_is_present_on_page() {
		verify.element_is_present("new_emp_create_button");
	}
	@MethodsData(method_id = "button_1")
	public void click_on_employee_check_box() {
		wait.wait_until_element_is_visible("employees_check_box_on_page_first");
		element.click("employees_check_box_on_page_first");
		element.get_element_text("employees_check_box_name_one");
		element.click("employees_check_box_on_page_second");
		element.get_element_text("employees_check_box_name_two");
		element.click("employees_check_box_on_page_third");
		element.get_element_text("employees_check_box_name_three");
	}
	@MethodsData(method_id = "text_1")
	public void verify_created_employee_display_on_employee_profile() {
		wait.wait_until_element_is_visible("employee_visible_employee_profile");
		verify.element_is_present("employee_visible_employee_profile");
	}
}