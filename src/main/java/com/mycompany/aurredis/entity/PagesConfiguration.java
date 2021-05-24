/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aurredis.entity;

/**
 *
 * @author MagedMamdouh
 */
public class PagesConfiguration {
    
    int	roleId;
    int	pageId;
    String funcMode;
    String langCode;
    int	controlId;
    int	componentId;
    int	visibleProp;
    int	enableProp;
    int	mandatoryProp;
    int	concealProp;
    String controlName;
    String labelDescr;
    String tooltipDescr;
    String dataType;
    String controlPk;
    String formatMask;
    String length;
    String minValue;
    String maxValue;
    String local;
    String justification;
    String controlType;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public String getFuncMode() {
        return funcMode;
    }

    public void setFuncMode(String funcMode) {
        this.funcMode = funcMode;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public int getControlId() {
        return controlId;
    }

    public void setControlId(int controlId) {
        this.controlId = controlId;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public int getVisibleProp() {
        return visibleProp;
    }

    public void setVisibleProp(int visibleProp) {
        this.visibleProp = visibleProp;
    }

    public int getEnableProp() {
        return enableProp;
    }

    public void setEnableProp(int enableProp) {
        this.enableProp = enableProp;
    }

    public int getMandatoryProp() {
        return mandatoryProp;
    }

    public void setMandatoryProp(int mandatoryProp) {
        this.mandatoryProp = mandatoryProp;
    }

    public int getConcealProp() {
        return concealProp;
    }

    public void setConcealProp(int concealProp) {
        this.concealProp = concealProp;
    }

    public String getControlName() {
        return controlName;
    }

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

    public String getLabelDescr() {
        return labelDescr;
    }

    public void setLabelDescr(String labelDescr) {
        this.labelDescr = labelDescr;
    }

    public String getTooltipDescr() {
        return tooltipDescr;
    }

    public void setTooltipDescr(String tooltipDescr) {
        this.tooltipDescr = tooltipDescr;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getControlPk() {
        return controlPk;
    }

    public void setControlPk(String controlPk) {
        this.controlPk = controlPk;
    }

    public String getFormatMask() {
        return formatMask;
    }

    public void setFormatMask(String formatMask) {
        this.formatMask = formatMask;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    @Override
    public String toString() {
        return "\nPagesConfiguration{" + "roleId=" + roleId + ", pageId=" + pageId + ", funcMode=" + funcMode + ", langCode=" + langCode + ", controlId=" + controlId + ", componentId=" + componentId + ", visibleProp=" + visibleProp + ", enableProp=" + enableProp + ", mandatoryProp=" + mandatoryProp + ", concealProp=" + concealProp + ", controlName=" + controlName + ", labelDescr=" + labelDescr + ", tooltipDescr=" + tooltipDescr + ", dataType=" + dataType + ", controlPk=" + controlPk + ", formatMask=" + formatMask + ", length=" + length + ", minValue=" + minValue + ", maxValue=" + maxValue + ", local=" + local + ", justification=" + justification + ", controlType=" + controlType + '}';
    }
    
    

    
}
