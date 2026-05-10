package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IdCard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 10f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.17f, 15f)
                arcToRelative(3f, 3f, 0f, false, true, 5.66f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.IdCardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IdCard: ImageVector
    @Composable get() = IdCardDefinition.asImageVector()
