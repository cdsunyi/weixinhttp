
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
		
		//企业ID
		String corpid = infostr[0];
		//	应用的凭证密钥
		String corpsecret = infostr[1];
		
		//授权方应用id
		String agentid = infostr[2];
		
/*		//发送内容
		String content = args[0];
		//发送日期
		String contentdate = args[1];*/
		
		//发送内容
		String content = "niaho";
		//发送日期
		String contentdate = "2017";
		
		//String corpid, String corpsecret, String agentid, String content, String contentdate
		
        System.out.println("主线程ID："+Thread.currentThread().getId());
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
