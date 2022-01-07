package com.prereads;

class RnaTranscription {
    String transcribe(String dnaStrand) {
        String str=new String();
        for(int i=0;i<dnaStrand.length();i++)
        {
            char c=dnaStrand.charAt(i);
            if(c=='G')
            {
                str=str+'C';
            }
            else if(c=='C')
            {
                str=str+'G';
            }
            else if(c=='T')
            {
                str=str+'A';
            }
            else
            {
                str=str+'U';
            }
        }
        return str;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
