public class ContactAction {

	private entities.Contact contact;

	public entities.Contact getContact() {
		return contact;
	}

	public void setContact(entities.Contact contact) {
		this.contact = contact;
	}

	public String execute() {
		System.out.println(contact);
		return "success";
	}
}
