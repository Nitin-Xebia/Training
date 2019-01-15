<?xml version='1.0' encoding='utf-8' ?>


<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"><xsl:output method="html"/>


<xsl:include href="Style1.xsl" />


<xsl:template match="/">
   <!-- Set Formatting Characteristics -->
	<xsl:call-template name="Style1"/>

		<h1>Generating Radio Buttons from XML Data (Pull Approach)</h1>


		<xsl:for-each select="UserOptions/option">
		       
		        <input type="radio">
			<xsl:attribute name="Name" >
			  <xsl:value-of select="@groupname" />
			</xsl:attribute>

			<xsl:attribute name="ID" >
			  <xsl:value-of select="@groupname" />
			</xsl:attribute>	

			<xsl:if test="@default ='true'">
			  <xsl:attribute name="checked" />
			</xsl:if>
			<xsl:value-of select="@title" />
					
			 <br></br>
			</input>
			
		</xsl:for-each>


</xsl:template>

</xsl:stylesheet>
