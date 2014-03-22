/*
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package org.openntf.xsp.oauth.application;

import java.io.IOException;
import java.util.Locale;
import javax.faces.FacesException;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import org.openntf.xsp.oauth.Activator;

public class ViewHandler extends com.ibm.xsp.application.ViewHandlerExImpl {
	private final javax.faces.application.ViewHandler _handler;
	private final static boolean _debug = Activator._debug;

	public ViewHandler(final javax.faces.application.ViewHandler paramViewHandler) {
		super(paramViewHandler);
		_handler = paramViewHandler;
		if (_debug) {
			System.out.println(getClass().getName() + " created using " + (_handler != null ? _handler.getClass().getName() : "null"));
		}
	}

	@Override
	public Locale calculateLocale(final FacesContext paramFacesContext) {
		// your code goes here
		return super.calculateLocale(paramFacesContext);
	}

	@Override
	public String calculateRenderKitId(final FacesContext paramFacesContext) {
		// your code goes here
		return super.calculateRenderKitId(paramFacesContext);
	}

	@Override
	public UIViewRoot createView(final FacesContext paramFacesContext, final String paramString) {
		// your code goes here
		return super.createView(paramFacesContext, paramString);
	}

	@Override
	public String getActionURL(final FacesContext paramFacesContext, final String paramString) {
		// your code goes here
		return super.getActionURL(paramFacesContext, paramString);
	}

	@Override
	public String getResourceURL(final FacesContext paramFacesContext, final String paramString) {
		// your code goes here
		return super.getResourceURL(paramFacesContext, paramString);
	}

	@Override
	public void renderView(final FacesContext paramFacesContext, final UIViewRoot paramUIViewRoot) throws IOException, FacesException {
		// your code goes here
		super.renderView(paramFacesContext, paramUIViewRoot);
	}

	@Override
	public UIViewRoot restoreView(final FacesContext paramFacesContext, final String paramString) {
		// your code goes here
		return super.restoreView(paramFacesContext, paramString);
	}

	@Override
	public void writeState(final FacesContext paramFacesContext) throws IOException {
		// your code goes here
		super.writeState(paramFacesContext);
	}
}
