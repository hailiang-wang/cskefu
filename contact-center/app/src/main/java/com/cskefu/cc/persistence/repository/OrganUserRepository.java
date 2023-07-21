/*
 * Copyright (C) 2023 Beijing Huaxia Chunsong Technology Co., Ltd. 
 * <https://www.chatopera.com>, Licensed under the Chunsong Public 
 * License, Version 1.0  (the "License"), https://docs.cskefu.com/licenses/v1.html
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Copyright (C) 2018- Jun. 2023 Chatopera Inc, <https://www.chatopera.com>,  Licensed under the Apache License, Version 2.0, 
 * http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2017 优客服-多渠道客服系统,  Licensed under the Apache License, Version 2.0, 
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package com.cskefu.cc.persistence.repository;

import com.cskefu.cc.model.OrganUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface OrganUserRepository extends JpaRepository<OrganUser, String> {

    List<OrganUser> findAll();

    OrganUser findByUseridAndOrgan(final String userid, final String organ);

    List<OrganUser> findByUserid(final String userid);

    List<OrganUser> findByOrgan(final String organ);

    List<OrganUser> findByOrganIn(final Collection<String> organs);

    @Modifying
    @Transactional
    @Query("DELETE FROM OrganUser o WHERE o.userid = :userid AND o.organ = :organ")
    void deleteOrganUserByUseridAndOrgan(@Param("userid") final String userid,
                                         @Param("organ") final String organ);
}

