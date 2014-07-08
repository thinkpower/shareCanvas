/**
 * 
 */
package com.lxz.talk.websocketx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.CharBuffer;

/**
 *<pre>
 * 功能概述：
 * 创建时间：2014-7-8上午10:10:38
 * 修改记录：
 * </pre>
 * @author xiaozu
 */
public class FileUtil {
	
	private static final String root = FileUtil.class.getResource("/html").getPath();

	public static String html(String path){
		StringBuffer str = new StringBuffer();
		try {
			FileReader reader  = new FileReader(root+File.separator+path);
			
			CharBuffer buf = CharBuffer.allocate(1024);
			while(true){
				buf.clear();
				int i = reader.read(buf);
				if(i<0) break;
				buf.flip();
				str.append(buf);
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str.toString();
		
	}
	
}
