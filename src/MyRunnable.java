import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MyRunnable implements Runnable{

	public String corpid = null;
	//	Ӧ�õ�ƾ֤��Կ
	public String corpsecret = null;
	
	//��Ȩ��Ӧ��id
	public String agentid = null;
	
	//��������
	public String content = null;
	//��������
	public String contentdate = null;
	
    public MyRunnable(String corpid, String corpsecret, String agentid, String content, String contentdate) {
		this.corpid = corpid;
		this.corpsecret = corpsecret;
		this.agentid = agentid;
		this.content = content;
		this.contentdate = contentdate;
    }
 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("���߳�ID��"+Thread.currentThread().getId());
		Httpclient http = new Httpclient(corpid,corpsecret,agentid,content,contentdate);
		http.weixinhttp();	
	}

}
