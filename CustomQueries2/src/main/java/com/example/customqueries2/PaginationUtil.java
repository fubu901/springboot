package com.example.customqueries2;
import org.springframework.data.domain.Page;
import java.util.List;

public class PaginationUtil {
    public static <T> List<T> getPageContent(Page<T> page) {
        return page.getContent();
    }
}
