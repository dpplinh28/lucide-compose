package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WebhookOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 17f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.09f, -.02f, -1.94f, .92f, -2.5f, 1.9f)
                arcTo(3f, 3f, 0f, true, true, 2.57f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3.4f)
                arcToRelative(4f, 4f, 0f, false, true, 6.52f, .66f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 17f)
                lineToRelative(3.1f, -5.8f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, .057f, -2.05f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.3f, 20.3f)
                arcToRelative(4f, 4f, 0f, false, true, -2.3f, .7f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.6f, 13f)
                arcToRelative(4f, 4f, 0f, false, true, 3.357f, 3.414f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 6f)
                lineToRelative(.6f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.WebhookOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WebhookOff: ImageVector
    @Composable get() = WebhookOffDefinition.asImageVector()
