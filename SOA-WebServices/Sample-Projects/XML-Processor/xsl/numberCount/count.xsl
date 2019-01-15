<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="text"/>

<xsl:template match="outline">
 <xsl:for-each select="section|//item">
  <xsl:number level="multiple" count="section | item" format="1."/><!--multiple single any-->
  <xsl:value-of select="@title | text()"/>
  <xsl:text>&#10;</xsl:text>
 </xsl:for-each>  
</xsl:template>

</xsl:stylesheet>
