package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Prohibited16: ImageVector
  get() {
    if (_prohibited16 != null) {
      return _prohibited16!!
    }
    _prohibited16 = fluentIcon(name = "Regular.Prohibited16", 16f) {
      materialPath {
          moveTo(11.875F, 3.418F)
          curveTo(9.517F, 1.42F, 5.98F, 1.533F, 3.757F, 3.758F)
          curveTo(1.533F, 5.98F, 1.42F, 9.517F, 3.418F, 11.874F)
          lineToRelative(8.457F, -8.457F)
          close()
          moveToRelative(0.707F, 0.707F)
          lineToRelative(-8.457F, 8.457F)
          curveToRelative(2.358F, 1.998F, 5.894F, 1.885F, 8.118F, -0.34F)
          curveToRelative(2.224F, -2.223F, 2.337F, -5.76F, 0.339F, -8.117F)
          close()
          moveTo(3.05F, 3.05F)
          curveToRelative(2.734F, -2.733F, 7.166F, -2.733F, 9.9F, 0.0F)
          curveToRelative(2.733F, 2.734F, 2.733F, 7.166F, 0.0F, 9.9F)
          curveToRelative(-2.734F, 2.733F, -7.166F, 2.733F, -9.9F, 0.0F)
          curveToRelative(-2.733F, -2.734F, -2.733F, -7.166F, 0.0F, -9.9F)
          close()        
      }
    }
    return _prohibited16!!
  }

private var _prohibited16: ImageVector? = null
