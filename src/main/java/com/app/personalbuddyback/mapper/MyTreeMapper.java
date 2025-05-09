package com.app.personalbuddyback.mapper;

import com.app.personalbuddyback.domain.ItemVO;
import com.app.personalbuddyback.domain.TreeCustomizingVO;
import com.app.personalbuddyback.domain.TreeVO;
import com.app.personalbuddyback.domain.TreeViewDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyTreeMapper {
    // 성장 나무 아이템 추가
    public void insertTreeItem(ItemVO itemVO);

    // 멤버 - 성장나무 연결 테이블 추가
    public void insertMemberTree(TreeVO treeVO);

    // 성장나무 추가 (아이템 구매 시)
    public void insertTreeCustomizing(TreeCustomizingVO treeCustomizingVO);

    // 성장나무 리스트 조회 (회원 아이디로)
    public List<TreeViewDTO>selectTreeViewsByMemberId(Long memberId);

    // 성장나무 꾸미기 수정
    public void updateTreeCustomizing(TreeCustomizingVO treeCustomizingVO);
}
