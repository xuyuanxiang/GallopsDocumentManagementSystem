select
        count(*) as col_0_0_ 
    from
        biz_document document0_ 
    where
        document0_.doc_is_enabled= 'Y'
        and document0_.doc_is_destoried= 'N' 
        and document0_.doc_root= '4028b8814448e8730144492fa130001c' 
        and (
            document0_.doc_parent is null
        )