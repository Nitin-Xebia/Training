<?xml version='1.0' encoding='utf-8' ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"><xsl:output method="html"/>
<xsl:include href="Style1.xsl" />

<xsl:template match="/">

		<!-- Set Formatting Characteristics -->
		<xsl:call-template name="Style1"/>

		<span class="subhead">Creating Hyperlinks from xml (Using the Push approach)</span>
		<br/><br/>


	        <xsl:value-of select="@url"/>
	        <xsl:apply-templates/>
</xsl:template>

    <xsl:template match="link">
	<span class="text">
	<b>Name:</b> <xsl:value-of select="@name"/><br/>
	<b>Description:</b> <xsl:value-of select="@description"/><br/>
	<b>URL:</b>  
	<a href="{@url}"> <xsl:value-of select="@url"/></a><br/><br/>
	</span>
   </xsl:template>


</xsl:stylesheet>
