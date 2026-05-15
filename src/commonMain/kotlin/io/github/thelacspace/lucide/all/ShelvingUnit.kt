package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShelvingUnit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 20f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 22f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 20f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 2f)
                verticalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                horizontalLineToRelative(16f)
            }
}

public val LucideIcons.All.ShelvingUnitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShelvingUnit: ImageVector
    @Composable get() = ShelvingUnitDefinition.asImageVector()
