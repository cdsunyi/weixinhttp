
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String iniStr = "./ini";
		inifile iFile = new inifile();
		String infostr[] = new String[2];
		if (iFile.cheakfile(iniStr)) {
			infostr = iFile.readerfile(iniStr+"//ini.txt");
		}
		
		//��ҵID
		String corpid = infostr[0];
		//	Ӧ�õ�ƾ֤��Կ
		String corpsecret = infostr[1];
		
		//��Ȩ��Ӧ��id
		String agentid = infostr[2];
		
/*		//��������
		String content = args[0];
		//��������
		String contentdate = args[1];*/
		
		//��������
		String content = "niaho";
		//��������
		String contentdate = "2017";
		
		//String corpid, String corpsecret, String agentid, String content, String contentdate
		
        System.out.println("���߳�ID��"+Thread.currentThread().getId());
        MyRunnable runnable = new MyRunnable(corpid,corpsecret,agentid,content,contentdate);
        Thread thread = new Thread(runnable);
/*        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);*/
        thread.start();
/*        thread2.start();
        thread3.start();
        thread4.start();*/
		
/*		Httpclient http = new Httpclient(corpid,corpsecret,agentid,content,contentdate);
		http.weixinhttp();*/
		
		
		
	}

}
