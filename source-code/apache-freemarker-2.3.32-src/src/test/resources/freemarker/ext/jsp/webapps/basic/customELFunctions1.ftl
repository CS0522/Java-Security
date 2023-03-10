<#--
  Licensed to the Apache Software Foundation (ASF) under one
  or more contributor license agreements.  See the NOTICE file
  distributed with this work for additional information
  regarding copyright ownership.  The ASF licenses this file
  to you under the Apache License, Version 2.0 (the
  "License"); you may not use this file except in compliance
  with the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing,
  software distributed under the License is distributed on an
  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  KIND, either express or implied.  See the License for the
  specific language governing permissions and limitations
  under the License.
-->
<#assign ef = JspTaglibs["http://freemarker.org/test/taglibs/el-functions"]>

${ef.reverse("abc")}
${ef.reverseInt(123)}
${ef.reverseIntRadix(123, 2)}
${ef.hypotenuse(3, 4)}
${ef.sum(ef.testArray())}
${ef.sum([1, 2, 3])}
${ef.sum(1, 2, 3)}
${ef.sum(1)}
${ef.sumMap(ef.testMap())}
${ef.sumMap({ 'a': 1?int, 'b': 2?int, 'c': 3?int })}