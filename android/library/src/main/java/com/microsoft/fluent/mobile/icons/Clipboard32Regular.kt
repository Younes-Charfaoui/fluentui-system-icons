package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Clipboard32: ImageVector
  get() {
    if (_clipboard32 != null) {
      return _clipboard32!!
    }
    _clipboard32 = fluentIcon(name = "Regular.Clipboard32", 32f) {
      materialPath {
          moveTo(19.0F, 2.0F)
          curveToRelative(1.306F, 0.0F, 2.418F, 0.835F, 2.83F, 2.0F)
          horizontalLineToRelative(1.67F)
          curveTo(25.433F, 4.0F, 27.0F, 5.567F, 27.0F, 7.5F)
          verticalLineToRelative(19.0F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          horizontalLineToRelative(-15.0F)
          curveTo(6.567F, 30.0F, 5.0F, 28.433F, 5.0F, 26.5F)
          verticalLineToRelative(-19.0F)
          curveTo(5.0F, 5.567F, 6.567F, 4.0F, 8.5F, 4.0F)
          horizontalLineToRelative(1.67F)
          curveToRelative(0.412F, -1.165F, 1.524F, -2.0F, 2.83F, -2.0F)
          horizontalLineToRelative(6.0F)
          close()
          moveToRelative(-6.0F, 2.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-6.0F)
          close()
          moveTo(8.5F, 6.0F)
          curveTo(7.672F, 6.0F, 7.0F, 6.672F, 7.0F, 7.5F)
          verticalLineToRelative(19.0F)
          curveTo(7.0F, 27.328F, 7.672F, 28.0F, 8.5F, 28.0F)
          horizontalLineToRelative(15.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-19.0F)
          curveTo(25.0F, 6.672F, 24.328F, 6.0F, 23.5F, 6.0F)
          horizontalLineToRelative(-1.67F)
          curveTo(21.417F, 7.165F, 20.305F, 8.0F, 19.0F, 8.0F)
          horizontalLineToRelative(-6.0F)
          curveToRelative(-1.306F, 0.0F, -2.418F, -0.835F, -2.83F, -2.0F)
          horizontalLineTo(8.5F)
          close()        
      }
    }
    return _clipboard32!!
  }

private var _clipboard32: ImageVector? = null
