<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version='2.0'>

<xsl:output method="html"/>

<xsl:template name="Be-Careful">
  <xsl:param name="message">Care</xsl:param>
  <table border="1">
  <!--Put the value of mesage parameter here-->
    <tr><th><xsl:value-of select="$message"/>:</th></tr>
    
    <tr><td><xsl:apply-templates/></td></tr>
    <!--Put the text value of Current element here-->
  </table>
</xsl:template>

<xsl:template match="warning">
  <xsl:call-template name="Be-Careful"/>
</xsl:template>

<xsl:template match="caution">
<!--Reuse the template earlier declared-->
  <xsl:call-template name="Be-Careful">
    <xsl:with-param name="message">Danger</xsl:with-param>
    <!--Pass the message parameter value to called template-->

  </xsl:call-template>
</xsl:template>

<xsl:template match="para">
  <p>
    <xsl:apply-templates/>
   </p>
</xsl:template>

<xsl:template match="emphasis">
    <i>
    <xsl:apply-templates/>
    </i>
</xsl:template>

</xsl:stylesheet>


