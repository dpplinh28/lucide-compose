package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Crop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.CropDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Crop: ImageVector
    @Composable get() = CropDefinition.asImageVector()
