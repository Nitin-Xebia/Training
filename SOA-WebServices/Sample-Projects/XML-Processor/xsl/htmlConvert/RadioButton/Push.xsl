<?xml version='1.0' encoding='utf-8' ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html"/>
	<xsl:include href="Style1.xsl"/>
	<xsl:template match="/">
		<xsl:call-template name="Style1"/>
		<h1>Generating Radio Buttons from XML Data (Push Approach)</h1>
		<xsl:apply-templates/>
	</xsl:template>

	<xsl:template match="UserOptions">
		<xsl:apply-templates/>
	</xsl:template>

	<xsl:template match="option">
		<xsl:value-of select="@title"/>
			<input type="radio">
				<xsl:attribute name="Name">
				   <xsl:value-of select="@groupname"/>
				</xsl:attribute>
				 <xsl:attribute name="ID">
				   <xsl:value-of select="@groupname"/>
				</xsl:attribute>
				<xsl:if test="@default = &apos;true&apos;">
				<!--xsl:if test="@default ='true'"-->
				   <xsl:attribute name="checked"/>
			        </xsl:if>
		</input>
	</xsl:template>
</xsl:stylesheet>
