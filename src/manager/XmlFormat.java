package manager;

/**
 * This class holds the xml templates.
 * For each element requested it returns
 * a a string array with the open element
 * in [0] and the closing element in [1].
 * 
 * @author carlosmarques
 *
 */

public class XmlFormat {
	
	private static final String OPEN = "<";
	private static final String CLOSE = ">";
	private static final String HEADER = "?xml version=\"1.0\" encoding=\"UTF-8\"?";
	private static final String CONTACT_MANAGER = "contactManager";
	private static final String CONTACT_LIST = "contactList";
	private static final String MEETING_LIST = "meetingList";
	private static final String CONTACT = "contact";
	private static final String MEETING = "meeting";
	private static final String NAME = "name";
	private static final String NOTE = "note";
	private static final String ID = "id";
	private static final String DATE = "date";
	private static final String TEXT = "text";
	private static final String CIDLIST = "cidlist";
	private static final String CID = "cid";
	private static final String xmlSkeleton = 	
			OPEN + HEADER + CLOSE + "\n" + 
			OPEN + CONTACT_MANAGER + CLOSE + "\n" + 
			OPEN + CONTACT_LIST + CLOSE + "\n" +  OPEN + "/" + CONTACT_LIST + CLOSE + "\n" +
			OPEN + MEETING_LIST + CLOSE + "\n" +  "/" + MEETING_LIST + CLOSE + "\n" + 
			OPEN + "/" + CONTACT_MANAGER + CLOSE + "\n";
	
	/**
	 * @return <?xml ....> \n <contactManager>
	 */
	public String getHeader(){
		return OPEN + HEADER + CLOSE + "\n" + 
				OPEN + CONTACT_MANAGER + CLOSE;
	}
	
	/**
	 * @return </contactManager>
	 */
	public String getFooter(){
		return OPEN + "/" + CONTACT_MANAGER + CLOSE;
	}

	/**
	 * @return the contactList
	 */
	public String[] getContactList() {
		return toArray(CONTACT_LIST);
	}

	/**
	 * @return the meetingList
	 */
	public String[] getMeetingList() {
		return toArray(MEETING_LIST);
	}

	
	/**
	 * @return the contact
	 */
	public String[] getContact() {
		return toArray(CONTACT);
	}

	/**
	 * @return the meeting
	 */
	public String[] getMeeting() {
		return toArray(MEETING);
	}

	/**
	 * @return the name
	 */
	public String[] getName() {
		return toArray(NAME);
	}

	/**
	 * @return the note
	 */
	public String[] getNote() {
		return toArray(NOTE);
	}

	/**
	 * @return the id
	 */
	public String[] getId() {
		return toArray(ID);
	}

	/**
	 * @return the date
	 */
	public String[] getDate() {
		return toArray(DATE);
	}

	/**
	 * @return the text
	 */
	public String[] getText() {
		return toArray(TEXT);
	}

	/**
	 * @return the cidlist
	 */
	public String[] getCidlist() {
		return toArray(CIDLIST);
	}

	/**
	 * @return the cid
	 */
	public String[] getCid() {
		return toArray(CID);
	}

	public String getSkeleton()
	{
		return xmlSkeleton;
	}
	  
	private static String[] toArray(String element)
	{
		String open = OPEN + element + CLOSE;
		String close = OPEN+ "/" + open.substring(1);
		String[] array = {open,close};
		return array;
	}

}






