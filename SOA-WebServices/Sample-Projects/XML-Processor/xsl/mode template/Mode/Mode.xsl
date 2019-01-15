<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

<xsl:output method="html"/>

<xsl:template match="chapter/title">
<br><xsl:text>The Title template is processed...</xsl:text></br>

   <h2>
    <xsl:apply-templates/>
   </h2>
</xsl:template>

<!--Declare a template with mode to apply in refered mode context-->

<xsl:template match="chapter/title" mode="MyRef">
<br><xsl:text>The Title template with Mode is seperately processed...</xsl:text></br>

  <br><i><xsl:apply-templates/></i></br>
</xsl:template>

<xsl:template match="xref">
<!--Declare a variable 'ModeLink' and asign it the value of 'link' attribute-->
  <xsl:variable name="ModeLink" select="@link"/>
  <xsl:apply-templates select="//*[@id=$ModeLink]/title"  mode="MyRef"/>

  <!--Find the element with attribute 'id=ch1' and Select the value of 
    its sub element named title-->
</xsl:template>

<xsl:template match="para">
  <p>
    <xsl:apply-templates/>
   </p>
</xsl:template>

<xsl:template match="strong">
  <b>
    <xsl:apply-templates/>
   </b>
</xsl:template>

</xsl:stylesheet>
