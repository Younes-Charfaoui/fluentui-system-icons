package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Search28: ImageVector
  get() {
    if (_search28 != null) {
      return _search28!!
    }
    _search28 = fluentIcon(name = "Filled.Search28", 28f) {
      materialPath {
          moveTo(5.0F, 11.5F)
          curveTo(5.0F, 7.91F, 7.91F, 5.0F, 11.5F, 5.0F)
          reflectiveCurveTo(18.0F, 7.91F, 18.0F, 11.5F)
          reflectiveCurveTo(15.09F, 18.0F, 11.5F, 18.0F)
          reflectiveCurveTo(5.0F, 15.09F, 5.0F, 11.5F)
          close()
          moveTo(11.5F, 3.0F)
          curveTo(6.806F, 3.0F, 3.0F, 6.806F, 3.0F, 11.5F)
          reflectiveCurveTo(6.806F, 20.0F, 11.5F, 20.0F)
          curveToRelative(1.987F, 0.0F, 3.815F, -0.682F, 5.262F, -1.824F)
          lineToRelative(6.53F, 6.531F)
          curveToRelative(0.391F, 0.39F, 1.025F, 0.39F, 1.415F, 0.0F)
          curveToRelative(0.39F, -0.39F, 0.39F, -1.024F, 0.0F, -1.414F)
          lineToRelative(-6.531F, -6.531F)
          curveTo(19.318F, 15.315F, 20.0F, 13.487F, 20.0F, 11.5F)
          curveTo(20.0F, 6.806F, 16.194F, 3.0F, 11.5F, 3.0F)
          close()        
      }
    }
    return _search28!!
  }

private var _search28: ImageVector? = null
