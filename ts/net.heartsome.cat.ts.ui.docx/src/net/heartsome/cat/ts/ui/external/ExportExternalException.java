/**
 * ExportExternalException.java
 *
 * Version information :
 *
 * Date:2013-11-1
 *
 * Copyright notice :
 * 本文件及其附带的相关文件包含机密信息，仅限瀚特盛科技有限公司指定的，与本项目有关的内部人员和客户联络人员查阅和使用。 
 * 如果您不是本保密声明中指定的收件者，请立即销毁本文件，禁止对本文件或根据本文件中的内容采取任何其他行动， 
 * 包括但不限于：泄露本文件中的信息、以任何方式制作本文件全部或部分内容之副本、将本文件或其相关副本提供给任何其他人。
 */
package net.heartsome.cat.ts.ui.external;

/**
 * 导出异常，批量处理中，抛出此异常意味着所有批量任务结束。
 * @author  Austen
 * @version 
 * @since   JDK1.6
 */
public class ExportExternalException extends Exception {

	/**  serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	public ExportExternalException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ExportExternalException(String message) {
		super(message);
	}

	public ExportExternalException() {
		super();
	}
	
}
