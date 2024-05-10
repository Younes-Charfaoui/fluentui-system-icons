package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderOpenVertical24: ImageVector
  get() {
    if (_folderOpenVertical24 != null) {
      return _folderOpenVertical24!!
    }
    _folderOpenVertical24 = fluentIcon(name = "Filled.FolderOpenVertical24", 24f) {
      materialPath {
          moveTo(21.0F, 5.25F)
          curveTo(21.0F, 3.455F, 19.545F, 2.0F, 17.75F, 2.0F)
          horizontalLineTo(8.84F)
          lineToRelative(3.54F, 2.045F)
          curveToRelative(1.316F, 0.759F, 2.126F, 2.162F, 2.126F, 3.68F)
          verticalLineTo(20.0F)
          horizontalLineToRelative(0.745F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-5.19F)
          lineToRelative(1.841F, -1.84F)
          curveToRelative(0.422F, -0.422F, 0.66F, -0.995F, 0.66F, -1.591F)
          verticalLineTo(5.25F)
          close()
          moveToRelative(-7.995F, 2.475F)
          verticalLineToRelative(13.02F)
          curveToRelative(0.0F, 1.732F, -1.875F, 2.814F, -3.375F, 1.948F)
          lineToRelative(-5.26F, -3.036F)
          curveToRelative(-0.85F, -0.491F, -1.375F, -1.4F, -1.375F, -2.382F)
          verticalLineTo(4.255F)
          curveToRelative(0.0F, -1.731F, 1.875F, -2.814F, 3.375F, -1.948F)
          lineToRelative(5.259F, 3.037F)
          curveToRelative(0.85F, 0.49F, 1.375F, 1.399F, 1.375F, 2.381F)
          close()        
      }
    }
    return _folderOpenVertical24!!
  }

private var _folderOpenVertical24: ImageVector? = null
