package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Edit16: ImageVector
  get() {
    if (_edit16 != null) {
      return _edit16!!
    }
    _edit16 = fluentIcon(name = "Regular.Edit16", 16f) {
      materialPath {
          moveTo(14.236F, 1.764F)
          curveToRelative(-1.024F, -1.024F, -2.684F, -1.024F, -3.707F, 0.0F)
          lineTo(2.657F, 9.636F)
          curveToRelative(-0.374F, 0.374F, -0.64F, 0.842F, -0.772F, 1.354F)
          lineToRelative(-0.87F, 3.386F)
          curveToRelative(-0.043F, 0.17F, 0.007F, 0.353F, 0.132F, 0.478F)
          curveToRelative(0.124F, 0.125F, 0.306F, 0.174F, 0.477F, 0.13F)
          lineToRelative(3.386F, -0.869F)
          curveToRelative(0.512F, -0.131F, 0.98F, -0.398F, 1.354F, -0.772F)
          lineToRelative(7.872F, -7.872F)
          curveToRelative(1.024F, -1.024F, 1.024F, -2.683F, 0.0F, -3.707F)
          close()
          moveToRelative(-3.0F, 0.707F)
          curveToRelative(0.633F, -0.633F, 1.66F, -0.633F, 2.293F, 0.0F)
          curveToRelative(0.633F, 0.633F, 0.633F, 1.66F, 0.0F, 2.293F)
          lineTo(12.75F, 5.543F)
          lineTo(10.457F, 3.25F)
          lineToRelative(0.779F, -0.779F)
          close()
          moveTo(9.75F, 3.957F)
          lineToRelative(2.293F, 2.293F)
          lineToRelative(-6.386F, 6.386F)
          curveTo(5.41F, 12.883F, 5.1F, 13.06F, 4.761F, 13.146F)
          lineToRelative(-2.567F, 0.66F)
          lineToRelative(0.66F, -2.567F)
          curveToRelative(0.086F, -0.34F, 0.263F, -0.649F, 0.51F, -0.896F)
          lineTo(9.75F, 3.957F)
          close()        
      }
    }
    return _edit16!!
  }

private var _edit16: ImageVector? = null
