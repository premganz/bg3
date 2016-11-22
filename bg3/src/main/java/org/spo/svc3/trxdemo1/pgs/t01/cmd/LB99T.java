package org.spo.svc3.trxdemo1.pgs.t01.cmd;

public class LB99T
{
    private SECTION_TRENDING_ZN[] SECTION_TRENDING_ZN;

    private String list_pagination_link;

    private String section_list_heading;

    private SECTION_LAND_TAGS_ZN[] SECTION_LAND_TAGS_ZN;

    private SECTION_OVV_ZN[] SECTION_OVV_ZN;

    private String page_sub_title;

    private SECTION_LAND_NEWS_ZN[] SECTION_LAND_NEWS_ZN;

    private String page_id;

    private String list_pagination_txt;

    private String page_description_text;

    private String list_pagination_ic;

    private String page_intro_note;

    private String page_title;

    public SECTION_TRENDING_ZN[] getSECTION_TRENDING_ZN ()
    {
        return SECTION_TRENDING_ZN;
    }

    public void setSECTION_TRENDING_ZN (SECTION_TRENDING_ZN[] SECTION_TRENDING_ZN)
    {
        this.SECTION_TRENDING_ZN = SECTION_TRENDING_ZN;
    }

    public String getList_pagination_link ()
    {
        return list_pagination_link;
    }

    public void setList_pagination_link (String list_pagination_link)
    {
        this.list_pagination_link = list_pagination_link;
    }

    public String getSection_list_heading ()
    {
        return section_list_heading;
    }

    public void setSection_list_heading (String section_list_heading)
    {
        this.section_list_heading = section_list_heading;
    }

    public SECTION_LAND_TAGS_ZN[] getSECTION_LAND_TAGS_ZN ()
    {
        return SECTION_LAND_TAGS_ZN;
    }

    public void setSECTION_LAND_TAGS_ZN (SECTION_LAND_TAGS_ZN[] SECTION_LAND_TAGS_ZN)
    {
        this.SECTION_LAND_TAGS_ZN = SECTION_LAND_TAGS_ZN;
    }

    public SECTION_OVV_ZN[] getSECTION_OVV_ZN ()
    {
        return SECTION_OVV_ZN;
    }

    public void setSECTION_OVV_ZN (SECTION_OVV_ZN[] SECTION_OVV_ZN)
    {
        this.SECTION_OVV_ZN = SECTION_OVV_ZN;
    }

    public String getPage_sub_title ()
    {
        return page_sub_title;
    }

    public void setPage_sub_title (String page_sub_title)
    {
        this.page_sub_title = page_sub_title;
    }

    public SECTION_LAND_NEWS_ZN[] getSECTION_LAND_NEWS_ZN ()
    {
        return SECTION_LAND_NEWS_ZN;
    }

    public void setSECTION_LAND_NEWS_ZN (SECTION_LAND_NEWS_ZN[] SECTION_LAND_NEWS_ZN)
    {
        this.SECTION_LAND_NEWS_ZN = SECTION_LAND_NEWS_ZN;
    }

    public String getPage_id ()
    {
        return page_id;
    }

    public void setPage_id (String page_id)
    {
        this.page_id = page_id;
    }

    public String getList_pagination_txt ()
    {
        return list_pagination_txt;
    }

    public void setList_pagination_txt (String list_pagination_txt)
    {
        this.list_pagination_txt = list_pagination_txt;
    }

    public String getPage_description_text ()
    {
        return page_description_text;
    }

    public void setPage_description_text (String page_description_text)
    {
        this.page_description_text = page_description_text;
    }

    public String getList_pagination_ic ()
    {
        return list_pagination_ic;
    }

    public void setList_pagination_ic (String list_pagination_ic)
    {
        this.list_pagination_ic = list_pagination_ic;
    }

    public String getPage_intro_note ()
    {
        return page_intro_note;
    }

    public void setPage_intro_note (String page_intro_note)
    {
        this.page_intro_note = page_intro_note;
    }

    public String getPage_title ()
    {
        return page_title;
    }

    public void setPage_title (String page_title)
    {
        this.page_title = page_title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SECTION_TRENDING_ZN = "+SECTION_TRENDING_ZN+", list_pagination_link = "+list_pagination_link+", section_list_heading = "+section_list_heading+", SECTION_LAND_TAGS_ZN = "+SECTION_LAND_TAGS_ZN+", SECTION_OVV_ZN = "+SECTION_OVV_ZN+", page_sub_title = "+page_sub_title+", SECTION_LAND_NEWS_ZN = "+SECTION_LAND_NEWS_ZN+", page_id = "+page_id+", list_pagination_txt = "+list_pagination_txt+", page_description_text = "+page_description_text+", list_pagination_ic = "+list_pagination_ic+", page_intro_note = "+page_intro_note+", page_title = "+page_title+"]";
    }
    
       
}

class SECTION_LAND_TAGS_ZN
{
    private String link_href;

    private String link_title;

    public String getLink_href ()
    {
        return link_href;
    }

    public void setLink_href (String link_href)
    {
        this.link_href = link_href;
    }

    public String getLink_title ()
    {
        return link_title;
    }

    public void setLink_title (String link_title)
    {
        this.link_title = link_title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [link_href = "+link_href+", link_title = "+link_title+"]";
    }
}
			

class SECTION_TRENDING_ZN
{
    private String link_href;

    private String link_sub_title;

    private String link_date;

    private String link_by;

    private String link_title;

    public String getLink_href ()
    {
        return link_href;
    }

    public void setLink_href (String link_href)
    {
        this.link_href = link_href;
    }

    public String getLink_sub_title ()
    {
        return link_sub_title;
    }

    public void setLink_sub_title (String link_sub_title)
    {
        this.link_sub_title = link_sub_title;
    }

    public String getLink_date ()
    {
        return link_date;
    }

    public void setLink_date (String link_date)
    {
        this.link_date = link_date;
    }

    public String getLink_by ()
    {
        return link_by;
    }

    public void setLink_by (String link_by)
    {
        this.link_by = link_by;
    }

    public String getLink_title ()
    {
        return link_title;
    }

    public void setLink_title (String link_title)
    {
        this.link_title = link_title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [link_href = "+link_href+", link_sub_title = "+link_sub_title+", link_date = "+link_date+", link_by = "+link_by+", link_title = "+link_title+"]";
    }
}
			

class SECTION_LAND_NEWS_ZN
{
   private String link_href;

   private String link_sub_title;

   private String link_date;

   private String link_by;
   private String link_id;

   public String getLink_id() {
	return link_id;
}

public void setLink_id(String link_id) {
	this.link_id = link_id;
}

private String link_title;

   public String getLink_href ()
   {
       return link_href;
   }

   public void setLink_href (String link_href)
   {
       this.link_href = link_href;
   }

   public String getLink_sub_title ()
   {
       return link_sub_title;
   }

   public void setLink_sub_title (String link_sub_title)
   {
       this.link_sub_title = link_sub_title;
   }

   public String getLink_date ()
   {
       return link_date;
   }

   public void setLink_date (String link_date)
   {
       this.link_date = link_date;
   }

   public String getLink_by ()
   {
       return link_by;
   }

   public void setLink_by (String link_by)
   {
       this.link_by = link_by;
   }

   public String getLink_title ()
   {
       return link_title;
   }

   public void setLink_title (String link_title)
   {
       this.link_title = link_title;
   }

   @Override
   public String toString()
   {
       return "ClassPojo [link_href = "+link_href+", link_sub_title = "+link_sub_title+", link_date = "+link_date+", link_by = "+link_by+", link_title = "+link_title+"]";
   }
}
class SECTION_OVV_ZN
{
    private String link_sub_title;

    private String link_date;

    private String link_by;

    private String link_title;

    private String link_id;

    public String getLink_sub_title ()
    {
        return link_sub_title;
    }

    public void setLink_sub_title (String link_sub_title)
    {
        this.link_sub_title = link_sub_title;
    }

    public String getLink_date ()
    {
        return link_date;
    }

    public void setLink_date (String link_date)
    {
        this.link_date = link_date;
    }

    public String getLink_by ()
    {
        return link_by;
    }

    public void setLink_by (String link_by)
    {
        this.link_by = link_by;
    }

    public String getLink_title ()
    {
        return link_title;
    }

    public void setLink_title (String link_title)
    {
        this.link_title = link_title;
    }

    public String getLink_id ()
    {
        return link_id;
    }

    public void setLink_id (String link_id)
    {
        this.link_id = link_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [link_sub_title = "+link_sub_title+", link_date = "+link_date+", link_by = "+link_by+", link_title = "+link_title+", link_id = "+link_id+"]";
    }
}
			
	