<stylesheet version="1.0" xmlns="http://www.w3.org/1999/XSL/Transform">

<output method="text"/>

<!--Which template will get applied ? the last one! if no priority is specified-->

<template match="/">
   Found Root!
 </template>

<template match="message" priority="3">
 <apply-templates/>
</template>



<template match="message" priority="2">
   This is a message!
 </template>

 
 


</stylesheet>
