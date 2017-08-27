package org.guzoff.traveler.model.search;

import lombok.Getter;
import static org.guzoff.traveler.util.Checks.checkParameter;

public class RangeCriteria {
    
    /**
     * Page index (0-based)
     */
    @Getter private final int page;
    
    /**
     * Number of elements per page.
     * Zero means that all the elements should be returned.
     */
    @Getter private final int rowCount;

    public RangeCriteria(int page, int rowCount) {
        checkParameter(page >= 0, "Incorrect page index:" + page);
        checkParameter(rowCount >= 0, "Incorrect row count:" + rowCount);
        this.page = page;
        this.rowCount = rowCount;
    }

}
