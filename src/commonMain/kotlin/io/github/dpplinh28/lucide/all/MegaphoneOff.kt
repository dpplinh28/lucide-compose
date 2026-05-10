package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MegaphoneOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.636f, 6f)
                arcTo(13f, 13f, 0f, false, false, 19.4f, 3.2f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4f)
                verticalLineToRelative(11.344f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.378f, 14.357f)
                arcTo(13f, 13f, 0f, false, false, 11f, 14f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                arcToRelative(12f, 12f, 0f, false, false, 2.4f, 7.2f)
                arcToRelative(2f, 2f, 0f, false, false, 3.2f, -2.4f)
                arcTo(8f, 8f, 0f, false, true, 10f, 14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 8f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.MegaphoneOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MegaphoneOff: ImageVector
    @Composable get() = MegaphoneOffDefinition.asImageVector()
