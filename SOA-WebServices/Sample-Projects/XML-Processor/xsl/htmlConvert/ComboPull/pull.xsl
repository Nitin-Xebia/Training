<?xml version='1.0' encoding='utf-8' ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>

	<xsl:include href="Style1.xsl"/>
	<xsl:template match="/">

		  <!--You cannot use the variable 'cmbDefault' here
		  since it is declared after here-->

	        <!--xsl:if test="@CustomerID = $cmb">		
		   <xsl:attribute name="selected"/>
		</xsl:if-->

		<!-- Set Formatting Characteristics -->
		<xsl:call-template name="Style1"/>

		<span class="subhead">Loading an HTML combo box elements from xml</span><br/><p></p>

		<xsl:variable name="cmb" select="&apos;anant&apos;"/>
		<SELECT id="cmbID" name="cmbCompanies">
			<xsl:for-each select="customers/customer">
				<xsl:element name="OPTION">
			<!--the customer with id ='anant' will be selected as default -->
					<xsl:if test="@CustomerID=$cmb">
						<xsl:attribute name="selected"/>
					</xsl:if>
					<!-- Set the value for the combo box element -->
					<xsl:value-of select="@CompanyName"/>
				</xsl:element>
			</xsl:for-each>
		</SELECT>
		 
	</xsl:template>
</xsl:stylesheet>
