package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.GlanceHorizontal32: ImageVector
  get() {
    if (_glanceHorizontal32 != null) {
      return _glanceHorizontal32!!
    }
    _glanceHorizontal32 = fluentIcon(name = "Filled.GlanceHorizontal32", 32f) {
      materialPath {
          moveTo(6.25F, 3.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(5.5F)
          curveTo(3.0F, 13.545F, 4.455F, 15.0F, 6.25F, 15.0F)
          horizontalLineToRelative(8.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-5.5F)
          curveTo(18.0F, 4.455F, 16.545F, 3.0F, 14.75F, 3.0F)
          horizontalLineToRelative(-8.5F)
          close()
          moveToRelative(11.0F, 15.0F)
          curveTo(15.455F, 18.0F, 14.0F, 19.455F, 14.0F, 21.25F)
          verticalLineToRelative(4.5F)
          curveToRelative(0.0F, 1.795F, 1.455F, 3.25F, 3.25F, 3.25F)
          horizontalLineToRelative(8.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-4.5F)
          curveToRelative(0.0F, -1.795F, -1.455F, -3.25F, -3.25F, -3.25F)
          horizontalLineToRelative(-8.5F)
          close()
          moveToRelative(7.0F, -15.0F)
          curveTo(22.455F, 3.0F, 21.0F, 4.455F, 21.0F, 6.25F)
          verticalLineToRelative(5.5F)
          curveToRelative(0.0F, 1.795F, 1.455F, 3.25F, 3.25F, 3.25F)
          horizontalLineToRelative(1.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-5.5F)
          curveTo(29.0F, 4.455F, 27.545F, 3.0F, 25.75F, 3.0F)
          horizontalLineToRelative(-1.5F)
          close()
          moveToRelative(-18.0F, 15.0F)
          curveTo(4.455F, 18.0F, 3.0F, 19.455F, 3.0F, 21.25F)
          verticalLineToRelative(4.5F)
          curveTo(3.0F, 27.545F, 4.455F, 29.0F, 6.25F, 29.0F)
          horizontalLineToRelative(1.5F)
          curveTo(9.545F, 29.0F, 11.0F, 27.545F, 11.0F, 25.75F)
          verticalLineToRelative(-4.5F)
          curveTo(11.0F, 19.455F, 9.545F, 18.0F, 7.75F, 18.0F)
          horizontalLineToRelative(-1.5F)
          close()        
      }
    }
    return _glanceHorizontal32!!
  }

private var _glanceHorizontal32: ImageVector? = null
