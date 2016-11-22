package org.spo.svc3.trxdemo1.pgs.t01.cmd;

public class CX99_Meta extends CX99T
{
private String meta_page_notes_date;

private String meta_page_notes_author;

private String meta_page_notes_categories;

private String meta_description_text;

private String meta_page_content_type_cd;

public String getMeta_page_notes_date ()
{
return meta_page_notes_date;
}

public void setMeta_page_notes_date (String meta_page_notes_date)
{
this.meta_page_notes_date = meta_page_notes_date;
}

public String getMeta_page_notes_author ()
{
return meta_page_notes_author;
}

public void setMeta_page_notes_author (String meta_page_notes_author)
{
this.meta_page_notes_author = meta_page_notes_author;
}

public String getMeta_page_notes_categories ()
{
return meta_page_notes_categories;
}

public void setMeta_page_notes_categories (String meta_page_notes_categories)
{
this.meta_page_notes_categories = meta_page_notes_categories;
}

public String getMeta_description_text ()
{
return meta_description_text;
}

public void setMeta_description_text (String meta_description_text)
{
this.meta_description_text = meta_description_text;
}

public String getMeta_page_content_type_cd ()
{
return meta_page_content_type_cd;
}

public void setMeta_page_content_type_cd (String meta_page_content_type_cd)
{
this.meta_page_content_type_cd = meta_page_content_type_cd;
}

@Override
public String toString()
{
return "ClassPojo [meta_page_notes_date = "+meta_page_notes_date+", meta_page_notes_author = "+meta_page_notes_author+", meta_page_notes_categories = "+meta_page_notes_categories+", meta_description_text = "+meta_description_text+", meta_page_content_type_cd = "+meta_page_content_type_cd+"]";
}
}

