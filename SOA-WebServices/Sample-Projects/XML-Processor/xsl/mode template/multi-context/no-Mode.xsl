<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

<xsl:template match="chapter/title">
<br> <xsl:text>Title template is applied..</xsl:text></br>
  <h1>
    <xsl:apply-templates/>
  </h1>
</xsl:template>

<xsl:template match="xref">
  <!--Declare a variable 'MyLink' and asign it the value of 'link' attribute-->
  <br> <xsl:text>This is xRef.. </xsl:text></br>
  <xsl:variable name="Mylink" select="@link"/><!--retrieve the attribute value-->
   <i>
  <xsl:apply-templates select="//*[@id=$Mylink]/title"/>
  <!--Find the element with attribute 'id=ch1' and Select the value of 
    its sub element named title-->
    </i>
</xsl:template>

<xsl:template match="para">
  <p>
   <xsl:apply-templates/>
  </p>
</xsl:template>

<xsl:template match="strong">
  <i>
    <xsl:apply-templates/>
   </i>
</xsl:template>

</xsl:stylesheet>
