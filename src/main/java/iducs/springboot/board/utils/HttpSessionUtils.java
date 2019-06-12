package iducs.springboot.board.utils;

import javax.servlet.http.HttpSession;

public class HttpSessionUtils {
	public static boolean isLongUser(HttpSession session, String key) {
		Object object = session.getAttribute(key);
		if(object == null) {
			return true;
		}
		return false;
	}
}
