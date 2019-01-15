<?xml version='1.0' encoding='utf-8' ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>
	<xsl:include href="Style1.xsl"/>
	<xsl:variable name="cmbDefault" select="'sunil'" />

	<xsl:template match="/">
	    <html>
	       <title>Pushing the data from xml to html</title>

		<!-- Set Formatting Characteristics -->
		<xsl:call-template name="Style1"/>

		<span class="subhead">Loading an HTML combo box from xml(Using the Push approach)</span>
		<br/><p></p>

		<SELECT id="cmbCompanies" name="cmbCompanies"> 
		<xsl:apply-templates/>
		</SELECT>
          </html>
	</xsl:template>


	<xsl:template match="customer">
		<xsl:element name="OPTION">
		
			<!--Make sure that the default value is sunil -->
			<xsl:if test="@CustomerID = $cmbDefault">
				<xsl:attribute name="selected" />
			</xsl:if>

			<!-- Set the value for the combo box -->
			<xsl:value-of select="@CompanyName"/>			
		</xsl:element>

	</xsl:template>

</xsl:stylesheet>
