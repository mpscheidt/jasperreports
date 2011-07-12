/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.engine.export.ooxml;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRGenericPrintElement;
import net.sf.jasperreports.engine.JRPrintImage;
import net.sf.jasperreports.engine.export.GenericElementHandler;
import net.sf.jasperreports.engine.export.JRExporterGridCell;

/**
 * A generic print element DOCX export handler.
 * 
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: GenericElementPdfHandler.java 3033 2009-08-27 11:46:22Z teodord $
 */
public interface GenericElementDocxHandler extends GenericElementHandler
{

	/**
	 * Exports a generic element.
	 * 
	 * <p>
	 * Access to the exporter output and environment is provided via the
	 * {@link JRDocxExporterContext} argument.
	 * 
	 * @param exporterContext the exporter context
	 * @param element the generic element to export
	 */
	void exportElement(JRDocxExporterContext exporterContext, JRGenericPrintElement element, JRExporterGridCell gridCell);
	
	/**
	 * Creates an equivalent image of the {@link JRGenericPrintElement} element to be exported instead.
	 * 
	 * @param element the generic element to export
	 * @return JRPrintImage the equivalent image
	 */
	JRPrintImage getImage(JRGenericPrintElement element) throws JRException;
	
}
