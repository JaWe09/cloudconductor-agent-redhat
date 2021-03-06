package de.cinovo.cloudconductor.agent.exceptions;

/*
 * #%L
 * Node Agent for cloudconductor framework
 * %%
 * Copyright (C) 2013 - 2014 Cinovo AG
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


/**
 * Copyright 2013 Cinovo AG<br>
 * <br>
 * 
 * @author psigloch
 * 
 */
public class ExecutionError extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	public ExecutionError() {
		super();
	}
	
	/**
	 * @param msg the message
	 */
	public ExecutionError(String msg) {
		super(msg);
	}
	
	/**
	 * @param msg the message
	 * @param t the cause
	 */
	public ExecutionError(String msg, Throwable t) {
		super(msg, t);
	}
	
	/**
	 * @param e the cause
	 */
	public ExecutionError(Throwable e) {
		super(e);
	}
	
}
