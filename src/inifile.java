/**
 * 2017-5-25
 *
 * getinifile.java
 *
 * @author GFQH-XL
 *
 */
/**
 * 
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 2017-5-25
 * 
 * getinifile.java
 * 
 * @author GFQH-XL
 * 
 */
public class inifile {

	/**
	 * �������ļ� ����ȡ�����Ϣ
	 * 
	 * @param fileName
	 *            �������ļ���λ��
	 */
	public String[] readerfile(String fileName) {
		String infostr[] = new String[6];
		File file = new File(fileName);
		BufferedReader reader = null;

		int line = 0;
		// һ�ζ���һ�У�ֱ������nullΪ�ļ�����
		try {
			// System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {
				// ��ʾ�к�
				infostr[line] = disposeStr(tempString);
				// System.out.println("line " + line + ": " + infostr[line]);
				line++;
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}

		}
		return infostr;
	}

	/**
	 * �����ȡ�����ļ��������Ϣ ���磺 IP=10.38.36.40 -> 10.38.36.40
	 * 
	 * @param str
	 *            �������ļ���ȡ����Ϣ�ַ���
	 * @return ���ش�������Ϣ ���磺10.38.36.40
	 */
	public String disposeStr(String str) {
		// str.indexOf("=");
		return str.substring(str.indexOf("=") + 1);
	}

	/**
	 * �ж��ļ����Ƿ����
	 * 
	 * @param logFileAdr
	 *            �������ļ���λ��
	 */
	public boolean cheakfile(String logFileAdr) {
		// �ж�log�ļ����Ƿ����
		File folder = new File(logFileAdr);
		if (!folder.exists()) {
			return false;
		}

		// �ж�txt�ļ��Ƿ����
		java.io.File file = new java.io.File(logFileAdr + "\\" + "ini.txt");
		if (file.exists()) {
			// System.out.println(file + " is already exists!");
			return true;
		} else {
			// System.out.println(file + " not found!");
			return false;
		}
	}

	/**
	 * 
	 * @return ��ȡϵͳǰһ�� ����ʱ��
	 */
	public String getSystemDate() {
		Date date = new Date();
		Date yesterdaydate = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		yesterdaydate = calendar.getTime();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String dateStr = dateFormat.format(yesterdaydate);
		// System.out.println(dateStr);
		return dateStr;
	}

	/**
	 * �������ļ� ����ȡ�����Ϣ
	 * 
	 * @param fileName
	 *            �������ļ���λ��
	 */
	public String readertimesetfile(String fileName) {
		String infostr = null;
		File file = new File(fileName);
		BufferedReader reader = null;

		// һ�ζ���һ�У�ֱ������nullΪ�ļ�����
		try {
			// System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {
				// ��ʾ�к�
				infostr = disposeStr(tempString);
				// System.out.println("line " + line + ": " + infostr[line]);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}

		}
		return infostr;

	}
	
	
}
