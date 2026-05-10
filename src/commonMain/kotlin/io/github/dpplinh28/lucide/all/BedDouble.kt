package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BedDouble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 20f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 10f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 4f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 18f)
                horizontalLineToRelative(20f)
            }
}

public val LucideIcons.All.BedDoubleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BedDouble: ImageVector
    @Composable get() = BedDoubleDefinition.asImageVector()
