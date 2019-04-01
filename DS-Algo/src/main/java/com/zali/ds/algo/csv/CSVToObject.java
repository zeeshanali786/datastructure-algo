package com.zali.ds.algo.csv;

import java.util.ArrayList;
import java.util.HashMap;

public class CSVToObject {

    String csv = "KEY_NCP_SPEC\tCLINIC_COMMON_NAME\tCLINIC_NAME\tDIRECTORY_ADDR1\tDIRECTORY_ADDR2\tDIRECTORY_ADDR3\tDIRECTORY_CITY\tDIRECTORY_STATE\tDIRECTORY_ZIP_CODE\tDIRECTORY_COUNTY\tBILL_ADDR1\tBILL_ADDR2\tBILL_ADDR3\tBILL_CITY\tBILL_STATE\tBILL_ZIP_CODE\tPHONE_AREA_CODE\tPHONE_NO\tFIRST_NAME\tMIDDLE_NAME\tLAST_NAME\tGENDER\tSPECIALTY\tSSN\tNPI\tTIN\tDEA_NO\tCURR_CRED\tPREV_CRED\tDCDC\tDCDC_BEGIN_DATE\tDCDC_END_DATE\tDCDC_TERM_DATE\tDCDC_DIR_FLAG\tDCDC_ACCPT_NEW\n" +
            "0003120-0001008\tDr Scott Carlson\tScott D Carlson\t4667 Dakota St SE\t\t\tPrior Lake\tMN\t553721714\tSCOTT\tPO BOX 325\t\t\tPRIOR LAKE\tMN\t553720325\t952\t447-6054\tSteven\tA\tAaker\tM\tGeneral Dentist\t474548112\t1538202965\t473563189\tBA8533108\t20070329\t20030813\tY\t20000427\t20050826\t20050826\tN\tY\n";



    private HashMap convert(String header, String str)
    {
        String[] columns = header.split("\t");

        String[] vals = str.split("\t");

        HashMap<String,String> hp = new HashMap<>();

        for(int i = 0 ; i < columns.length; i++) {
            hp.put(columns[i],vals[i]);
        }
return hp;


    }



}
