package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bath") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 4f)
                lineTo(8f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 19f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 19f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 5f)
                lineTo(7.621f, 3.621f)
                arcTo(2.121f, 2.121f, 0f, false, false, 4f, 5f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-5f)
            }
}

public val LucideIcons.All.BathDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bath: ImageVector
    @Composable get() = BathDefinition.asImageVector()
