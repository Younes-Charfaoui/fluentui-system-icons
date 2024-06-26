package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.AlignSpaceEvenlyVertical24: ImageVector
  get() {
    if (_alignSpaceEvenlyVertical24 != null) {
      return _alignSpaceEvenlyVertical24!!
    }
    _alignSpaceEvenlyVertical24 = fluentIcon(name = "Filled.AlignSpaceEvenlyVertical24", 24f) {
      materialPath {
          moveTo(6.5F, 2.0F)
          curveTo(5.12F, 2.0F, 4.0F, 3.12F, 4.0F, 4.5F)
          verticalLineToRelative(1.0F)
          curveTo(4.0F, 6.88F, 5.12F, 8.0F, 6.5F, 8.0F)
          horizontalLineToRelative(11.0F)
          curveTo(18.88F, 8.0F, 20.0F, 6.88F, 20.0F, 5.5F)
          verticalLineToRelative(-1.0F)
          curveTo(20.0F, 3.12F, 18.88F, 2.0F, 17.5F, 2.0F)
          horizontalLineToRelative(-11.0F)
          close()
          moveToRelative(0.0F, 7.0F)
          curveTo(5.12F, 9.0F, 4.0F, 10.12F, 4.0F, 11.5F)
          verticalLineToRelative(1.0F)
          curveTo(4.0F, 13.88F, 5.12F, 15.0F, 6.5F, 15.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-1.0F)
          curveToRelative(0.0F, -1.38F, -1.12F, -2.5F, -2.5F, -2.5F)
          horizontalLineToRelative(-11.0F)
          close()
          moveToRelative(0.0F, 7.0F)
          curveTo(5.12F, 16.0F, 4.0F, 17.12F, 4.0F, 18.5F)
          verticalLineToRelative(1.0F)
          curveTo(4.0F, 20.88F, 5.12F, 22.0F, 6.5F, 22.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-1.0F)
          curveToRelative(0.0F, -1.38F, -1.12F, -2.5F, -2.5F, -2.5F)
          horizontalLineToRelative(-11.0F)
          close()        
      }
    }
    return _alignSpaceEvenlyVertical24!!
  }

private var _alignSpaceEvenlyVertical24: ImageVector? = null
