package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BadgeSwissFranc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.85f, 8.62f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 6.74f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 6.74f)
                arcToRelative(4f, 4f, 0f, false, true, -4.77f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, -6.75f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, -4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, -6.76f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 17f)
                verticalLineTo(8f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 12f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 16f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.BadgeSwissFrancDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BadgeSwissFranc: ImageVector
    @Composable get() = BadgeSwissFrancDefinition.asImageVector()
