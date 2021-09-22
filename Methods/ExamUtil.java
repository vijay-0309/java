class ExamUtil{

static String[] hallTicket={"Ramdev Baba","PA06AY026","Home Products"};

  public static void main(String a[])
{

	boolean allowed= Exam.allow(hallTicket);
	System.out.println(allowed);
}
}