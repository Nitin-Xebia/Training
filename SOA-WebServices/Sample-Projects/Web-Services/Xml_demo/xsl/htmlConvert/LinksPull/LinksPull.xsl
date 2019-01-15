<?xml version='1.0' encoding='utf-8' ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html"/>
	<xsl:include href="Style1.xsl"/>
	<xsl:template match="/">

		<!-- Set Formatting Characteristics -->
		<xsl:call-template name="Style1"/>

		<h1>Converting an xml data to html links in table format(Using the Pull approach)</h1>
		<p></p>
		<table border="1">
			<tr>
				<th>name</th>
				<th>description</th>
				<th>url</th>
			</tr>

		<xsl:for-each select="links/link">
			<tr>
			<td>
			<xsl:value-of select="@name"/>
			</td>
			<td>
			<xsl:value-of select="@description"/>
			</td>
			<td>
			<a>
			<xsl:attribute name="href">
			<xsl:value-of select="@url"/>
			</xsl:attribute>
			<xsl:value-of select="@url"/>
			</a>

			<!--a>
			<!--This is another approach-->
			<xsl:attribute name="href">{@url}</xsl:attribute>
			<xsl:value-of select="@url"/>
			</a-->
			</td>
			</tr>
		</xsl:for-each>

		</table>
	</xsl:template>
</xsl:stylesheet>
