/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aurredis.constants;

/**
 *
 * @author MagedMamdouh
 */
public class Queries {
    public static final String PAGES_QUERY = "SELECT \n" +
"     RCNP.ROLE_ID,\n" +
"     P.PAGE_ID,\n" +
"     RCNP.FUNC_MODE,\n" +
"     SL.LANG_CODE,\n" +
"     RCNP.CONTROL_ID,\n" +
"    RCNP.COMPONENT_ID,\n" +
"    RCNP.VISIBLE_PROP,\n" +
"    RCNP.ENABLE_PROP,\n" +
"    RCNP.MANDATORY_PROP,\n" +
"    RCNP.CONCEAL_PROP,\n" +
"    CN.CONTROL_NAME,\n" +
"    CNN.LABEL_DESCR,\n" +
"    CNN.TOOLTIP_DESCR,\n" +
"    DECODE (\n" +
"      RCNP.CONCEAL_PROP,\n" +
"      1, 'password',\n" +
"      DECODE (CN.DATA_TYPE,\n" +
"              1, 'number',\n" +
"              2, 'text',\n" +
"              3, 'date',\n" +
"              4, 'tel' ,\n" +
"              5 , 'email',\n" +
"              CN.DATA_TYPE))\n" +
"      DATA_TYPE,\n" +
"    CN.CONTROL_PK,\n" +
"    RCNP.FORMAT_MASK,\n" +
"    RCNP.LENGTH,\n" +
"    RCNP.MIN_VALUE,\n" +
"    RCNP.MAX_VALUE,\n" +
"    RCNP.LOCAL,\n" +
"    RCNP.JUSTIFICATION,\n" +
"    CN.CONTROL_TYPE\n" +
"FROM AUR_BPLUS.BP_ROLES_CONTROLS_PROP RCNP,\n" +
"    BP_COMPONENTS_NAMES CMN,\n" +
"    BP_CONTROLS CN,\n" +
"    BP_CONTROLS_NAMES CNN,\n" +
"    BP_PAGES P,\n" +
"    BP_SYSTEM_LANGUAGES SL\n" +
" WHERE RCNP.PAGE_NAME = P.PAGE_NAME\n" +
"    AND CMN.COMPONENT_ID = RCNP.COMPONENT_ID\n" +
"    AND CMN.LANG_CODE = CNN.LANG_CODE\n" +
"    AND CNN.LANG_CODE = SL.LANG_CODE\n" +
"    AND CN.CONTROL_ID = RCNP.CONTROL_ID\n" +
"    AND CN.COMPONENT_ID = CMN.COMPONENT_ID\n" +
"    AND CMN.PAGE_NAME = P.PAGE_NAME\n" +
"    AND CN.PAGE_NAME = P.PAGE_NAME\n" +
"    AND CNN.PAGE_NAME = P.PAGE_NAME\n" +
"    AND CNN.COMPONENT_ID = CN.COMPONENT_ID\n" +
"    AND CNN.CONTROL_ID = RCNP.CONTROL_ID\n" +
"    AND RCNP.FUNC_MODE='I' AND SL.LANG_CODE='EN'";
    
    //   AND RCNP.ROLE_ID=104  AND P.PAGE_ID=533
}
