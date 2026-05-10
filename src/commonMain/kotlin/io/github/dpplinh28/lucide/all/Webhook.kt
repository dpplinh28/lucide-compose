package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Webhook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 16.98f)
                horizontalLineToRelative(-5.99f)
                curveToRelative(-1.1f, 0f, -1.95f, .94f, -2.48f, 1.9f)
                arcTo(4f, 4f, 0f, false, true, 2f, 17f)
                curveToRelative(.01f, -.7f, .2f, -1.4f, .57f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 17f)
                lineToRelative(3.13f, -5.78f)
                curveToRelative(.53f, -.97f, .1f, -2.18f, -.5f, -3.1f)
                arcToRelative(4f, 4f, 0f, true, true, 6.89f, -4.06f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 6f)
                lineToRelative(3.13f, 5.73f)
                curveTo(15.66f, 12.7f, 16.9f, 13f, 18f, 13f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
            }
}

public val LucideIcons.All.WebhookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Webhook: ImageVector
    @Composable get() = WebhookDefinition.asImageVector()
